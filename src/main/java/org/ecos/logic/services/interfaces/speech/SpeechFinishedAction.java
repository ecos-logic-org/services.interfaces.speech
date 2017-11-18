package org.ecos.logic.services.interfaces.speech;

import org.ecos.logic.services.interfaces.exceptions.NotInitialized;

public interface SpeechFinishedAction {
    void fireFinished() throws NotInitialized;
}
