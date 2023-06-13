package co.bird.android.feature.localssurvey;

import com.facebook.share.internal.C17296a;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class})
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/localssurvey/b;", "", "Lco/bird/android/feature/localssurvey/LocalsSurveyActivity;", "activity", "", C17296a.f69688o, "locals-survey_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.localssurvey.b */
/* loaded from: classes3.dex */
public interface InterfaceC14942b {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/localssurvey/b$a;", "", "LlG2;", "mainComponent", "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;", "autocompleteFragment", "Lco/bird/android/feature/localssurvey/b;", C17296a.f69688o, "locals-survey_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.localssurvey.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14943a {
        /* renamed from: a */
        InterfaceC14942b mo57994a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance AutocompleteSupportFragment autocompleteSupportFragment);
    }

    /* renamed from: a */
    void mo57995a(LocalsSurveyActivity localsSurveyActivity);
}
