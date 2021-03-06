package com.alchitry.labs.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import com.alchitry.labs.Settings;

public class Theme {
	public static boolean set;
	public static Color mainAccentColor;
	public static Color darkAccentColor;
	public static Color moduleColor;
	public static Color keyWordColor;
	public static Color valueColor;
	public static Color varTypeColor;
	public static Color operatorColor;
	public static Color commentColor;
	public static Color stringColor;
	public static Color constColor;
	public static Color nameSpaceColor;
	public static Color functionColor;
	public static Color instantiationColor;
	public static Color editorBackgroundColor;
	public static Color editorForegroundColor;
	public static Color comboBackgroundColor;
	public static Color editorTextSelectedColor;
	public static Color bulletTextColor;
	public static Color highlightedLineColor;
	public static Color highlightedWordColor;
	public static Color tabBackgroundColor;
	public static Color tabForegroundColor;
	public static Color tabSelectedForegroundColor;
	public static Color tabSelectedBackgroundColor;
	public static Color windowBackgroundColor;
	public static Color windowForgroundColor;
	public static Color treeSelectedFocusedColor;
	public static Color treeSelectedColor;
	public static Color treeSelectedForegroundColor;
	public static Color treeHoverColor;
	public static Color toolBarHoverColor;
	public static Color toolBarClickColor;
	public static Color consoleBackgroundColor;
	public static Color consoleForegoundColor;
	public static Color successTextColor;
	public static Color errorTextColor;
	public static Color warningTextColor;
	public static Color infoTextColor;
	public static Color debugTextColor;
	public static Color autocompleteBackgroundColor;
	public static Color autocompleteForegroundColor;
	public static Color autocompleteHighlightColor;
	public static Color searchBackgroundColor;
	public static Color bracketUnderlineColor;
	public static Color clockMarkerColor;

	public static Color tabErrorTextColor;
	public static Color tabWarningTextColor;
	public static Color tabNormalTextColor;
	public static Color tabHoverTextColor;
	
	public static Color waveButtonHoverColor;
	public static Color waveButtonActiveColor;
	public static Color waveGridColor;
	public static Color waveCursorColor;
	
	public static Font defaultFont;
	public static Font boldFont;
	
	public static void init(Display display) {
		initColors(display);
		initFonts(display);
		set = true;
	}

	private static void initColors(Display display) {
		if (Settings.pref.getBoolean(Settings.THEME, false)) {
			mainAccentColor = new Color(display, 255, 204, 0);
			darkAccentColor = new Color(display, 191, 152, 29);
			moduleColor = new Color(display, 217, 165, 11);
			keyWordColor = new Color(display, 8, 153, 153);
			valueColor = new Color(display, 110, 0, 224);
			varTypeColor = new Color(display, 0, 131, 182);
			operatorColor = new Color(display, 204, 21, 21);
			commentColor = new Color(display, 110, 110, 110);
			stringColor = new Color(display, 179, 179, 18);
			constColor = new Color(display, 192, 0, 203);
			nameSpaceColor = new Color(display, 203, 0, 99);
			functionColor = new Color(display, 0, 162, 123);
			instantiationColor = new Color(display, 166, 96, 17);
			comboBackgroundColor  = new Color(display, 240, 240, 240);
			editorBackgroundColor = new Color(display, 250, 250, 250);
			editorForegroundColor = new Color(display, 0, 0, 0);
			editorTextSelectedColor = new Color(display, 160, 160, 160);
			bulletTextColor = new Color(display, 25, 25, 25);
			highlightedLineColor = new Color(display, 210, 210, 208);
			highlightedWordColor = new Color(display, 200, 200, 190);
			tabSelectedForegroundColor = bulletTextColor;
			tabSelectedBackgroundColor = editorBackgroundColor;
			windowBackgroundColor = new Color(display, 230, 230, 228);
			windowForgroundColor = new Color(display, 245, 245, 243);
			tabBackgroundColor = highlightedLineColor;
			tabForegroundColor = windowForgroundColor;
			treeSelectedFocusedColor = mainAccentColor;
			treeSelectedColor = editorTextSelectedColor;
			treeSelectedForegroundColor = editorBackgroundColor;
			treeHoverColor = new Color(display, 220, 220, 220);
			toolBarHoverColor = mainAccentColor;
			toolBarClickColor = darkAccentColor;
			consoleBackgroundColor = editorBackgroundColor;
			consoleForegoundColor = editorForegroundColor;
			successTextColor = new Color(display, 25, 255, 25);
			errorTextColor = new Color(display, 255, 25, 25);
			warningTextColor = new Color(display, 222, 175, 0);
			debugTextColor = new Color(display, 128, 255, 0);
			infoTextColor = new Color(display, 0, 189, 255);
			tabErrorTextColor = errorTextColor;
			tabWarningTextColor = warningTextColor;
			tabNormalTextColor = editorForegroundColor;
			tabHoverTextColor = editorBackgroundColor;
			autocompleteBackgroundColor = new Color(display, 220, 220, 220);
			autocompleteForegroundColor = consoleForegoundColor;
			autocompleteHighlightColor = mainAccentColor;
			searchBackgroundColor = new Color(display, 240, 240, 240);
			bracketUnderlineColor = new Color(display, 0, 0, 0);
			clockMarkerColor = new Color(display, 240, 240, 240);
			waveButtonHoverColor = treeHoverColor;
			waveButtonActiveColor = mainAccentColor;
			waveGridColor = new Color(display, 220, 220, 220);
			waveCursorColor = new Color(display, 0, 0, 0);
		} else {
			mainAccentColor = new Color(display, 255, 204, 0);
			darkAccentColor = new Color(display, 191, 152, 29);
			moduleColor = new Color(display, 217, 165, 11);
			keyWordColor = new Color(display, 10, 191, 191);
			valueColor = new Color(display, 162, 105, 220);
			varTypeColor = new Color(display, 10, 141, 191);
			operatorColor = new Color(display, 237, 67, 67);
			commentColor = new Color(display, 150, 150, 150);
			stringColor = new Color(display, 191, 191, 10);
			constColor = new Color(display, 212, 90, 218);
			nameSpaceColor = new Color(display, 218, 90, 140);
			functionColor = new Color(display, 27, 221, 175);
			instantiationColor = new Color(display, 234, 182, 123);
			comboBackgroundColor = new Color(display, 50, 50, 45);
			editorBackgroundColor = new Color(display, 40, 40, 35);
			editorForegroundColor = new Color(display, 255, 255, 255);
			editorTextSelectedColor = new Color(display, 100, 100, 90);
			bulletTextColor = new Color(display, 200, 200, 200);
			highlightedLineColor = editorTextSelectedColor;
			highlightedWordColor = new Color(display, 90, 90, 75);
			tabSelectedForegroundColor = bulletTextColor;
			tabSelectedBackgroundColor = editorBackgroundColor;
			windowBackgroundColor = new Color(display, 80, 80, 75);
			windowForgroundColor = new Color(display, 10, 10, 8);
			tabBackgroundColor = highlightedLineColor;
			tabForegroundColor = windowForgroundColor;
			treeSelectedFocusedColor = mainAccentColor;
			treeSelectedColor = highlightedLineColor;
			treeSelectedForegroundColor = editorForegroundColor;
			treeHoverColor = new Color(display, 75, 75, 65);
			toolBarHoverColor = mainAccentColor;
			toolBarClickColor = darkAccentColor;
			consoleBackgroundColor = editorBackgroundColor;
			consoleForegoundColor = editorForegroundColor;
			successTextColor = new Color(display, 25, 255, 25);
			errorTextColor = new Color(display, 255, 25, 25);
			warningTextColor = new Color(display, 255, 255, 25);
			infoTextColor = new Color(display, 0, 189, 255);
			debugTextColor = new Color(display, 128, 255, 0);
			tabErrorTextColor = new Color(display, 255, 100, 100);
			tabWarningTextColor = new Color(display, 255, 255, 100);
			tabNormalTextColor = editorForegroundColor;
			tabHoverTextColor = tabNormalTextColor;
			autocompleteBackgroundColor = new Color(display, 55, 55, 50);
			autocompleteForegroundColor = consoleForegoundColor;
			autocompleteHighlightColor = mainAccentColor;
			searchBackgroundColor = new Color(display, 60, 60, 55);
			bracketUnderlineColor = new Color(display, 255, 255, 255);
			clockMarkerColor = new Color(display, 50, 50, 45);
			waveButtonHoverColor = treeHoverColor;
			waveButtonActiveColor = mainAccentColor;
			waveGridColor = new Color(display, 80, 80, 70);
			waveCursorColor = new Color(display, 255, 255, 255);
		}
	}
	
	private static void initFonts(Display display) {
		defaultFont = new Font(display, "Ubuntu", 12, SWT.NORMAL);
		boldFont = new Font(display, "Ubuntu", 12, SWT.BOLD);
	}

	public static void dispose() {
		mainAccentColor.dispose();
		darkAccentColor.dispose();
		moduleColor.dispose();
		keyWordColor.dispose();
		valueColor.dispose();
		varTypeColor.dispose();
		operatorColor.dispose();
		commentColor.dispose();
		stringColor.dispose();
		constColor.dispose();
		nameSpaceColor.dispose();
		functionColor.dispose();
		instantiationColor.dispose();
		comboBackgroundColor.dispose();
		editorBackgroundColor.dispose();
		editorForegroundColor.dispose();
		editorTextSelectedColor.dispose();
		bulletTextColor.dispose();
		highlightedLineColor.dispose();
		highlightedWordColor.dispose();
		tabSelectedBackgroundColor.dispose();
		tabSelectedForegroundColor.dispose();
		windowBackgroundColor.dispose();
		windowForgroundColor.dispose();
		tabBackgroundColor.dispose();
		tabForegroundColor.dispose();
		treeSelectedFocusedColor.dispose();
		treeSelectedColor.dispose();
		treeSelectedForegroundColor.dispose();
		treeHoverColor.dispose();
		toolBarHoverColor.dispose();
		toolBarClickColor.dispose();
		consoleBackgroundColor.dispose();
		consoleForegoundColor.dispose();
		successTextColor.dispose();
		errorTextColor.dispose();
		warningTextColor.dispose();
		infoTextColor.dispose();
		debugTextColor.dispose();
		tabErrorTextColor.dispose();
		tabWarningTextColor.dispose();
		tabNormalTextColor.dispose();
		tabHoverTextColor.dispose();
		autocompleteBackgroundColor.dispose();
		autocompleteForegroundColor.dispose();
		autocompleteHighlightColor.dispose();
		bracketUnderlineColor.dispose();
		clockMarkerColor.dispose();
		waveButtonHoverColor.dispose();
		waveButtonActiveColor.dispose();
		waveGridColor.dispose();
		waveCursorColor.dispose();
		
		defaultFont.dispose();
		boldFont.dispose();
		
		set = false;
	}
}
