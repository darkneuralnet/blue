package pl.charmas.android.reactivelocation2.observables;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23446J;
/* loaded from: classes8.dex */
public class TaskSingleOnSubscribe<T extends Response> implements InterfaceC23446J<T> {
    private final Task<T> task;

    public TaskSingleOnSubscribe(Task<T> task) {
        this.task = task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.InterfaceC23446J
    public void subscribe(final InterfaceC23444H<T> interfaceC23444H) {
        this.task.addOnSuccessListener(new OnSuccessListener<T>() { // from class: pl.charmas.android.reactivelocation2.observables.TaskSingleOnSubscribe.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                onSuccess((C273592) ((Response) obj));
            }

            public void onSuccess(T t) {
                if (interfaceC23444H.mo1769e()) {
                    return;
                }
                interfaceC23444H.onSuccess(t);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: pl.charmas.android.reactivelocation2.observables.TaskSingleOnSubscribe.1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                if (!interfaceC23444H.mo1769e()) {
                    interfaceC23444H.onError(exc);
                }
            }
        });
    }
}
