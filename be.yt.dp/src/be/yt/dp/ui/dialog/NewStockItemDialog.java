package be.yt.dp.ui.dialog;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import dp.Produkt;
import dp.Schuif;

public class NewStockItemDialog extends TitleAreaDialog {
	private Text aantalText;
	private Text infoText;
	private String aantal;
	private String info;
	private String datum;
	private String produkt;
	private String schuif;
	List<Produkt>prodList;
	List<Schuif>schuifList;

	public NewStockItemDialog(Shell parentShell,List<Produkt> prodList,List<Schuif>schuifList) {
		super(parentShell);
		this.prodList = prodList;
		this.schuifList = schuifList;
		info="";
	}

	@Override
	public void create() {
		super.create();
		// Set the title
		setTitle("This is my first own dialog");
		// Set the message
		setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);

	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		// layout.horizontalAlignment = GridData.FILL;
		parent.setLayout(layout);

		// The text fields will grow with the size of the dialog
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		Label label1 = new Label(parent, SWT.NONE);
		label1.setText("Aantal");

		aantalText = new Text(parent, SWT.BORDER);
		aantalText.setLayoutData(gridData);

		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		// input for info field

		Label label5 = new Label(parent, SWT.NONE);
		label5.setText("Info");

		infoText = new Text(parent, SWT.BORDER);
		infoText.setLayoutData(gridData);

		// input for date

		Label label2 = new Label(parent, SWT.NONE);
		label2.setText("Datum");
		// You should not re-use GridData
		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		DateTime dateD = new DateTime(parent, SWT.DATE | SWT.DROP_DOWN);
		dateD.setLayoutData(gridData);
		//init date in case user pushed OK button without selecting anything
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		datum = sdf.format(date);
		// if a date is selected put it in the datum string
		dateD.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);

				datum = ((DateTime) e.getSource()).getDay() + "/"
						+ ((DateTime) e.getSource()).getMonth() + "/"
						+ ((DateTime) e.getSource()).getYear();
				System.out.println("Datum geselecteerd : " + datum);
			}
			
		});
		// comboviewer for Produkt
		Label label3 = new Label(parent, SWT.NONE);
		label3.setText("Produkt");

		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		ComboViewer comboViewer = new ComboViewer(parent, SWT.READ_ONLY);

		
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		comboViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Produkt) {
					Produkt produkt = (Produkt) element;
					return produkt.getNaam();
				}
				return super.getText(element);
			}
		});

		comboViewer.setInput(prodList);
		//make sure that the comboviewer displays the first item in catlist
		StructuredSelection structuredSelection = new StructuredSelection(prodList.get(0));
		comboViewer.setSelection(structuredSelection,true);
		// init produkt value in case user has pushed OK button whitout
		// selecting anything
		produkt = prodList.get(0).getNaam();
		comboViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();
						System.out.println(((Produkt) selection
								.getFirstElement()).getNaam());
						produkt = ((Produkt) selection.getFirstElement())
								.getNaam();
					}
				});

		// comboviewer for schuif
		Label label4 = new Label(parent, SWT.NONE);
		label4.setText("Schuif");

		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		ComboViewer schuifComboViewer = new ComboViewer(parent, SWT.READ_ONLY);

		schuifComboViewer
				.setContentProvider(ArrayContentProvider.getInstance());
		schuifComboViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Schuif) {
					Schuif schuif = (Schuif) element;
					return String.valueOf(schuif.getNummer());
				}
				return super.getText(element);
			}
		});

		schuifComboViewer.setInput(schuifList);
		// make sure that the comboviewer displays the first item in catlist
		StructuredSelection schuifStructuredSelection = new StructuredSelection(
				schuifList.get(0));
		schuifComboViewer.setSelection(schuifStructuredSelection, true);
		// init schuif in case has pushed OK button without selecting anything
		schuif = String.valueOf(schuifList.get(0).getNummer());
		schuifComboViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();
						System.out.println(((Schuif) selection
								.getFirstElement()).getNummer());
						schuif = String.valueOf(((Schuif) selection
								.getFirstElement()).getNummer());
					}
				});

		return parent;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 3;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.CENTER;

		parent.setLayoutData(gridData);
		// Create Add button
		// Own method as we need to overview the SelectionAdapter
		createOkButton(parent, OK, "Add", true);
		// Add a SelectionListener

		// Create Cancel button
		Button cancelButton = createButton(parent, CANCEL, "Cancel", false);
		// Add a SelectionListener
		cancelButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setReturnCode(CANCEL);
				close();
			}
		});
	}

	protected Button createOkButton(Composite parent, int id, String label,
			boolean defaultButton) {
		// increment the number of columns in the button bar
		((GridLayout) parent.getLayout()).numColumns++;
		Button button = new Button(parent, SWT.PUSH);
		button.setText(label);
		button.setFont(JFaceResources.getDialogFont());
		button.setData(new Integer(id));
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if (isValidInput()) {
					okPressed();
				}
			}
		});
		if (defaultButton) {
			Shell shell = parent.getShell();
			if (shell != null) {
				shell.setDefaultButton(button);
			}
		}
		setButtonLayoutData(button);
		return button;
	}

	private boolean isValidInput() {
		boolean valid = true;
		if (aantalText.getText().length() == 0) {
			setErrorMessage("Vul het aantal in");
			valid = false;
		}
//		if (datum.length() == 0) {
//			setErrorMessage("Please maintain the last name");
//			valid = false;
//		}
		return valid;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	// Coyy textFields because the UI gets disposed
	// and the Text Fields are not accessible any more.
	private void saveInput() {
		aantal = aantalText.getText();
		info = infoText.getText();
		//datum = datumText.getText();
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public String getAantalAsString() {
		return aantal;
	}

	public String getDatumAsString() {
		return datum;
	}

	public String getProduktAsString() {
		return produkt;
	}

	public String getSchuifAsString() {
		return schuif;
	}

	public String getInfo() {
		return info;
	}
}
