package com.mySampleApplication.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

public class main {
    interface mainUiBinder extends UiBinder<DivElement, main> {
    }

    private static mainUiBinder ourUiBinder = GWT.create(mainUiBinder.class);

    public main() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }
}