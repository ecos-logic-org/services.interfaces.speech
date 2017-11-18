package org.ecos.logic.services.interfaces.speech;

import org.ecos.logic.services.interfaces.exceptions.NotInitialized;

public interface SpeechEngine {
    void speak(String text) throws NotInitialized;
    void speak(String text, SpeechFinishedAction mOnSyllableSpeechFinishedAction) throws NotInitialized;
}