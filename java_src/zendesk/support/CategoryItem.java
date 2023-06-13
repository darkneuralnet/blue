package zendesk.support;

import java.util.List;
/* loaded from: classes8.dex */
public class CategoryItem implements HelpItem {
    private boolean expanded = true;
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private Long f121944id;
    @InterfaceC41208ft5("name")
    private String name;
    @InterfaceC41208ft5("section_count")
    private int sectionCount;
    private List<SectionItem> sections;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Long l = this.f121944id;
        Long l2 = ((CategoryItem) obj).f121944id;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.HelpItem
    public Long getId() {
        return this.f121944id;
    }

    @Override // zendesk.support.HelpItem
    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    @Override // zendesk.support.HelpItem
    public Long getParentId() {
        return null;
    }

    public List<SectionItem> getSections() {
        return C43505jm0.m29954c(this.sections);
    }

    @Override // zendesk.support.HelpItem
    public int getViewType() {
        return 1;
    }

    public int hashCode() {
        Long l = this.f121944id;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean setExpanded(boolean z) {
        this.expanded = z;
        return z;
    }

    public void setSections(List<SectionItem> list) {
        this.sections = C43505jm0.m29954c(list);
    }
}
