package org.weisenz.mediabrowser.controller.entities;

import java.util.List;

public interface IItemByName {
    List<BaseItem> GetTaggedItems(InternalItemsQuery query);
}
