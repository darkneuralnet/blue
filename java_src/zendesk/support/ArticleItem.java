package zendesk.support;
/* loaded from: classes8.dex */
public class ArticleItem implements HelpItem {

    /* renamed from: id */
    private Long f121940id;
    private String name;
    @InterfaceC41208ft5("section_id")
    private Long sectionId;

    public ArticleItem(Long l, Long l2, String str) {
        this.f121940id = l;
        this.sectionId = l2;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArticleItem articleItem = (ArticleItem) obj;
        Long l = this.f121940id;
        if (l == null ? articleItem.f121940id != null : !l.equals(articleItem.f121940id)) {
            return false;
        }
        Long l2 = this.sectionId;
        Long l3 = articleItem.sectionId;
        if (l2 != null) {
            return l2.equals(l3);
        }
        if (l3 == null) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.HelpItem
    public Long getId() {
        return this.f121940id;
    }

    @Override // zendesk.support.HelpItem
    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    @Override // zendesk.support.HelpItem
    public Long getParentId() {
        return this.sectionId;
    }

    @Override // zendesk.support.HelpItem
    public int getViewType() {
        return 3;
    }

    public int hashCode() {
        int i;
        Long l = this.f121940id;
        int i2 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Long l2 = this.sectionId;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i3 + i2;
    }
}
