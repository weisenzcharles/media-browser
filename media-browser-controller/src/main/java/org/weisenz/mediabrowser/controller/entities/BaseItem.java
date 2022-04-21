package org.weisenz.mediabrowser.controller.entities;

import org.weisenz.mediabrowser.controller.providers.IHasLookupInfo;
import org.weisenz.mediabrowser.controller.providers.ItemLookupInfo;

public class BaseItem implements IHasLookupInfo<ItemLookupInfo> {
    @Override
    public ItemLookupInfo GetLookupInfo() {
        return GetItemLookupInfo();
    }
    public ItemLookupInfo GetItemLookupInfo (){
        return null;
    }
//    protected T GetItemLookupInfo<T extends ItemLookupInfo>()  where T : ItemLookupInfo {
//        return null;
//    }
}
