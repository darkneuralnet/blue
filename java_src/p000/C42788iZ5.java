package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import zendesk.support.CreateRequest;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¨\u0006\u0005"}, m28432d2 = {"", "subject", "description", "Lzendesk/support/CreateRequest;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: iZ5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42788iZ5 {
    /* renamed from: a */
    public static final CreateRequest m33804a(String subject, String description) {
        List<String> listOf;
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(description, "description");
        CreateRequest createRequest = new CreateRequest();
        createRequest.setSubject(subject);
        createRequest.setDescription(description);
        listOf = CollectionsKt__CollectionsJVMKt.listOf("cancel_task_request");
        createRequest.setTags(listOf);
        return createRequest;
    }
}
