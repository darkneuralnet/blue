package zendesk.support.requestlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes8.dex */
public class RequestListConfiguration implements InterfaceC40057dx0 {
    private final List<InterfaceC40057dx0> configurations;
    private final boolean contactUsButtonVisible;

    /* loaded from: classes8.dex */
    public static class Builder {
        private List<InterfaceC40057dx0> configurations = new ArrayList();
        private boolean contactUsButtonVisible = true;

        private void setConfigurations(List<InterfaceC40057dx0> list) {
            this.configurations = list;
        }

        public InterfaceC40057dx0 config() {
            return new RequestListConfiguration(this);
        }

        public Intent intent(Context context, InterfaceC40057dx0... interfaceC40057dx0Arr) {
            return intent(context, Arrays.asList(interfaceC40057dx0Arr));
        }

        public void show(Context context, InterfaceC40057dx0... interfaceC40057dx0Arr) {
            context.startActivity(intent(context, interfaceC40057dx0Arr));
        }

        public Builder withContactUsButtonVisible(boolean z) {
            this.contactUsButtonVisible = z;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<InterfaceC40057dx0> list) {
            setConfigurations(list);
            InterfaceC40057dx0 config = config();
            Intent intent = new Intent(context, RequestListActivity.class);
            C32756Ex0.m108196c(intent, config);
            return intent;
        }

        public void show(Context context, List<InterfaceC40057dx0> list) {
            context.startActivity(intent(context, list));
        }
    }

    @Override // p000.InterfaceC40057dx0
    @SuppressLint({"RestrictedApi"})
    public List<InterfaceC40057dx0> getConfigurations() {
        return C32756Ex0.m108198a(this.configurations, this);
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsButtonVisible;
    }

    private RequestListConfiguration(Builder builder) {
        this.contactUsButtonVisible = builder.contactUsButtonVisible;
        this.configurations = builder.configurations;
    }
}
