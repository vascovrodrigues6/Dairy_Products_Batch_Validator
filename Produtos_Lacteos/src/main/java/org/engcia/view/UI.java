package org.engcia.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

import org.kie.api.runtime.ClassObjectFilter;
import org.engcia.model.Evidence;
import org.engcia.produtosLacteos.ProdutosLacteos;

public class UI {
	
	private final static String[] OPCOES_VALIDAS = {"leite cru","leite pasteurizado","leite gordo","leite meio gordo","leite magro","leite achocolatado","leite em pó","manteiga","natas","sair"};
	
	private static BufferedReader br;

	public static void uiInit() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void uiClose() {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static boolean answer(String ev, String v) {
		@SuppressWarnings("unchecked")
		Collection<Evidence> evidences = (Collection<Evidence>) ProdutosLacteos.KS
				.getObjects(new ClassObjectFilter(Evidence.class));
		boolean questionFound = false;
		Evidence evidence = null;
		for (Evidence e : evidences) {
			if (e.getEvidence().compareTo(ev) == 0) {
				questionFound = true;
				evidence = e;
				break;
			}
		}
		if (questionFound) {
			if (evidence.getValue().compareTo(v) == 0) {
				ProdutosLacteos.agendaEventListener.addLhs(evidence);
				return true;
			} else {
				return false;
			}
		}
		System.out.print(ev + "? ");
		String value = readLine();

		Evidence e = new Evidence(ev, value);
		ProdutosLacteos.KS.insert(e);
		
		if (value.compareTo(v) == 0) {
			ProdutosLacteos.agendaEventListener.addLhs(e);
			return true;
		} else {	
			return false;
		}
	}
	
	public static boolean answerUnknown(String ev, String v) {
		@SuppressWarnings("unchecked")
		Collection<Evidence> evidences = (Collection<Evidence>) ProdutosLacteos.KS
				.getObjects(new ClassObjectFilter(Evidence.class));
		boolean questionFound = false;
		Evidence evidence = null;
		for (Evidence e : evidences) {
			if (e.getEvidence().compareTo(ev) == 0) {
				questionFound = true;
				evidence = e;
				break;
			}
		}
		if (questionFound) {
			if(!Arrays.asList(OPCOES_VALIDAS).contains(evidence.getValue())) {
				return true;
			} else {
				return false;
			}
		}
		System.out.print(ev + "? ");
		String value = readLine();

		Evidence e = new Evidence(ev, value);
		ProdutosLacteos.KS.insert(e);
		
		if(!Arrays.asList(OPCOES_VALIDAS).contains(evidence.getValue())) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean answerValuesBiggerEqual(String ev, Float expected) {
		@SuppressWarnings("unchecked")
		Collection<Evidence> evidences = (Collection<Evidence>) ProdutosLacteos.KS
				.getObjects(new ClassObjectFilter(Evidence.class));
		boolean questionFound = false;
		Evidence evidence = null;
		for (Evidence e : evidences) {
			if (e.getEvidence().compareTo(ev) == 0) {
				questionFound = true;
				evidence = e;
				break;
			}
		}
		if (questionFound) {
			if (Float.parseFloat(evidence.getValue()) >= expected) {
				ProdutosLacteos.agendaEventListener.addLhs(evidence);
				return true;
			} else {
				return false;
			}
		}
		System.out.print(ev + "? ");
		String value = readLine();

		Evidence e = new Evidence(ev, value);
		ProdutosLacteos.KS.insert(e);

		if (Float.parseFloat(value) >= expected) {
			ProdutosLacteos.agendaEventListener.addLhs(e);
			return true;
		} else {
			return false;
		}
	}

	public static boolean answerValuesBigger(String ev, Float expected) {
		@SuppressWarnings("unchecked")
		Collection<Evidence> evidences = (Collection<Evidence>) ProdutosLacteos.KS
				.getObjects(new ClassObjectFilter(Evidence.class));
		boolean questionFound = false;
		Evidence evidence = null;
		for (Evidence e : evidences) {
			if (e.getEvidence().compareTo(ev) == 0) {
				questionFound = true;
				evidence = e;
				break;
			}
		}
		if (questionFound) {
			if (Float.parseFloat(evidence.getValue()) > expected) {
				ProdutosLacteos.agendaEventListener.addLhs(evidence);
				return true;
			} else {
				return false;
			}
		}
		System.out.print(ev + "? ");
		String value = readLine();

		Evidence e = new Evidence(ev, value);
		ProdutosLacteos.KS.insert(e);

		if (Float.parseFloat(value) > expected) {
			ProdutosLacteos.agendaEventListener.addLhs(e);
			return true;
		} else {
			return false;
		}
	}

	public static boolean answerValuesSmallerEqual(String ev, Float expected) {
		@SuppressWarnings("unchecked")
		Collection<Evidence> evidences = (Collection<Evidence>) ProdutosLacteos.KS
				.getObjects(new ClassObjectFilter(Evidence.class));
		boolean questionFound = false;
		Evidence evidence = null;
		for (Evidence e : evidences) {
			if (e.getEvidence().compareTo(ev) == 0) {
				questionFound = true;
				evidence = e;
				break;
			}
		}
		if (questionFound) {
			if (Float.parseFloat(evidence.getValue()) <= expected) {
				ProdutosLacteos.agendaEventListener.addLhs(evidence);
				return true;
			} else {
				return false;
			}
		}
		System.out.print(ev + "? ");
		String value = readLine();

		Evidence e = new Evidence(ev, value);
		ProdutosLacteos.KS.insert(e);

		if (Float.parseFloat(value) <= expected) {
			ProdutosLacteos.agendaEventListener.addLhs(e);
			return true;
		} else {
			return false;
		}
	}

	public static boolean answerValuesSmaller(String ev, Float expected) {
		@SuppressWarnings("unchecked")
		Collection<Evidence> evidences = (Collection<Evidence>) ProdutosLacteos.KS
				.getObjects(new ClassObjectFilter(Evidence.class));
		boolean questionFound = false;
		Evidence evidence = null;
		for (Evidence e : evidences) {
			if (e.getEvidence().compareTo(ev) == 0) {
				questionFound = true;
				evidence = e;
				break;
			}
		}
		if (questionFound) {
			if (Float.parseFloat(evidence.getValue()) < expected) {
				ProdutosLacteos.agendaEventListener.addLhs(evidence);
				return true;
			} else {
				return false;
			}
		}
		System.out.print(ev + "? ");
		String value = readLine();

		Evidence e = new Evidence(ev, value);
		ProdutosLacteos.KS.insert(e);

		if (Float.parseFloat(value) < expected) {
			ProdutosLacteos.agendaEventListener.addLhs(e);
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean answerValuesRange(String ev, Float expectedFloor, Float expectedRoof) {
		@SuppressWarnings("unchecked")
		Collection<Evidence> evidences = (Collection<Evidence>) ProdutosLacteos.KS
				.getObjects(new ClassObjectFilter(Evidence.class));
		boolean questionFound = false;
		Evidence evidence = null;
		for (Evidence e : evidences) {
			if (e.getEvidence().compareTo(ev) == 0) {
				questionFound = true;
				evidence = e;
				break;
			}
		}
		if (questionFound) {
			if (Float.parseFloat(evidence.getValue()) >= expectedFloor && Float.parseFloat(evidence.getValue()) <= expectedRoof) {
				ProdutosLacteos.agendaEventListener.addLhs(evidence);
				return true;
			} else {
				return false;
			}
		}
		System.out.print(ev + "? ");
		String value = readLine();

		Evidence e = new Evidence(ev, value);
		ProdutosLacteos.KS.insert(e);

		if (Float.parseFloat(value) >= expectedFloor && Float.parseFloat(value) <= expectedRoof) {
			return true;
		} else {
			ProdutosLacteos.agendaEventListener.addLhs(e);
			return false;
		}
	}

	private static String readLine() {
		String input = "";

		try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return input;
	}

}
