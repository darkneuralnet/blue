package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zendesk.messaging.Engine;
import zendesk.messaging.EngineListRegistry;
/* loaded from: classes8.dex */
public class HelpCenterConfiguration implements InterfaceC40057dx0 {
    private final List<Long> categoryIds;
    private final boolean collapseCategories;
    private List<InterfaceC40057dx0> configurations;
    private final boolean contactUsButtonVisibility;
    private final String engineRegistryId;
    private final String[] labelNames;
    private final List<Long> sectionIds;
    private final boolean showConversationsMenuButton;

    /* loaded from: classes8.dex */
    public static class Builder {
        private List<Long> categoryIds = Collections.emptyList();
        private List<Long> sectionIds = Collections.emptyList();
        private String[] labelNames = new String[0];
        private List<Engine> engines = Collections.emptyList();
        private boolean contactUsButtonVisible = true;
        private boolean collapseCategories = false;
        private boolean showConversationsMenuButton = true;
        private List<InterfaceC40057dx0> configurations = new ArrayList();

        private void setConfigurations(List<InterfaceC40057dx0> list) {
            this.configurations = list;
            HelpCenterConfiguration helpCenterConfiguration = (HelpCenterConfiguration) C32054Bx0.m113273h().m113276e(list, HelpCenterConfiguration.class);
            if (helpCenterConfiguration != null) {
                this.contactUsButtonVisible = helpCenterConfiguration.contactUsButtonVisibility;
                this.categoryIds = helpCenterConfiguration.categoryIds;
                this.sectionIds = helpCenterConfiguration.sectionIds;
                this.collapseCategories = helpCenterConfiguration.collapseCategories;
                this.labelNames = helpCenterConfiguration.labelNames;
                this.engines = EngineListRegistry.INSTANCE.retrieveEngineList(helpCenterConfiguration.engineRegistryId);
                this.showConversationsMenuButton = helpCenterConfiguration.showConversationsMenuButton;
            }
        }

        public InterfaceC40057dx0 config() {
            return new HelpCenterConfiguration(this, EngineListRegistry.INSTANCE.register(this.engines));
        }

        public Intent intent(Context context, InterfaceC40057dx0... interfaceC40057dx0Arr) {
            return intent(context, Arrays.asList(interfaceC40057dx0Arr));
        }

        public void show(Context context, InterfaceC40057dx0... interfaceC40057dx0Arr) {
            context.startActivity(intent(context, interfaceC40057dx0Arr));
        }

        public Builder withArticlesForCategoryIds(Long... lArr) {
            return withArticlesForCategoryIds(Arrays.asList(lArr));
        }

        public Builder withArticlesForSectionIds(Long... lArr) {
            return withArticlesForSectionIds(Arrays.asList(lArr));
        }

        public Builder withCategoriesCollapsed(boolean z) {
            this.collapseCategories = z;
            return this;
        }

        public Builder withContactUsButtonVisible(boolean z) {
            this.contactUsButtonVisible = z;
            return this;
        }

        public Builder withEngines(List<Engine> list) {
            this.engines = list;
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            if (C43505jm0.m29947j(strArr)) {
                this.labelNames = strArr;
            }
            return this;
        }

        public Builder withShowConversationsMenuButton(boolean z) {
            this.showConversationsMenuButton = z;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<InterfaceC40057dx0> list) {
            setConfigurations(list);
            Intent intent = new Intent(context, HelpCenterActivity.class);
            C32054Bx0.m113273h().m113278c(intent, config());
            return intent;
        }

        public void show(Context context, List<InterfaceC40057dx0> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withArticlesForCategoryIds(List<Long> list) {
            if (this.sectionIds.size() > 0) {
                C33694Ix2.m101447l("HelpCenterActivity", "Builder: sections have already been specified. Removing section IDs to set category IDs.", new Object[0]);
                this.sectionIds = Collections.emptyList();
            }
            this.categoryIds = C43505jm0.m29954c(list);
            return this;
        }

        public Builder withArticlesForSectionIds(List<Long> list) {
            if (this.categoryIds.size() > 0) {
                C33694Ix2.m101447l("HelpCenterActivity", "Builder: categories have already been specified. Removing category IDs to set section IDs.", new Object[0]);
                this.categoryIds = Collections.emptyList();
            }
            this.sectionIds = C43505jm0.m29954c(list);
            return this;
        }

        public Builder withEngines(Engine... engineArr) {
            return withEngines(Arrays.asList(engineArr));
        }

        public Builder withLabelNames(List<String> list) {
            return withLabelNames((String[]) list.toArray(new String[0]));
        }
    }

    public List<Long> getCategoryIds() {
        return this.categoryIds;
    }

    @Override // p000.InterfaceC40057dx0
    @SuppressLint({"RestrictedApi"})
    public List<InterfaceC40057dx0> getConfigurations() {
        return C32054Bx0.m113273h().m113280a(this.configurations, this);
    }

    public List<Engine> getEngines() {
        return EngineListRegistry.INSTANCE.retrieveEngineList(this.engineRegistryId);
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public List<Long> getSectionIds() {
        return this.sectionIds;
    }

    public boolean isCollapseCategories() {
        return this.collapseCategories;
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsButtonVisibility;
    }

    public boolean isShowConversationsMenuButton() {
        return this.showConversationsMenuButton;
    }

    private HelpCenterConfiguration(Builder builder, String str) {
        this.categoryIds = builder.categoryIds;
        this.sectionIds = builder.sectionIds;
        this.labelNames = builder.labelNames;
        this.contactUsButtonVisibility = builder.contactUsButtonVisible;
        this.collapseCategories = builder.collapseCategories;
        this.showConversationsMenuButton = builder.showConversationsMenuButton;
        this.configurations = builder.configurations;
        this.engineRegistryId = str;
    }
}
