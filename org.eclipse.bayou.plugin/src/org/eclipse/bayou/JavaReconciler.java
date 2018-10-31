package org.eclipse.bayou;

import org.eclipse.bayou.JavaReconcilerStrategy;
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.reconciler.Reconciler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;

public class JavaReconciler extends Reconciler {

    private JavaReconcilerStrategy fStrategy;

    public JavaReconciler() {
        // TODO this is logic for .project file to fold tags. Replace with your language logic!
        fStrategy = new JavaReconcilerStrategy();
        this.setReconcilingStrategy(fStrategy, IDocument.DEFAULT_CONTENT_TYPE);
    }

    @Override
    public void install(ITextViewer textViewer) {
        super.install(textViewer);
        ProjectionViewer pViewer =(ProjectionViewer)textViewer;
        fStrategy.setProjectionViewer(pViewer);
    }
}