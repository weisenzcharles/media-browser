package org.weisenz.mediabrowser.controller.providers;

import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;

public class ItemLookupInfo {
    protected static String[] StringArray = new String[0];

    public String Name;
    public String MetadataLanguage;
    public String MetadataCountryCode;
    public Dictionary<String, String> ProviderIds;
    public int Year;
    public int IndexNumber;
    public int ParentIndexNumber;
    public Date PremiereDate;
    public boolean IsAutomated;

    public ItemLookupInfo() {
        IsAutomated = true;
        ProviderIds = new Hashtable<String, String>();
    }
}
