package org.weisenz.mediabrowser.controller.providers;

public interface IHasLookupInfo<TLookupInfoType extends ItemLookupInfo> {
    TLookupInfoType GetLookupInfo();
}
