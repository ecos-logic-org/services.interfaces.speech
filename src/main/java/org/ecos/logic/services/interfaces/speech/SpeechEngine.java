package org.ecos.logic.services.interfaces.speech;

public interface SpeechEngine {
    void speak(String syllable);
    void speak(String syllable, SpeakFinished mOnSyllableSpeakFinished);
}