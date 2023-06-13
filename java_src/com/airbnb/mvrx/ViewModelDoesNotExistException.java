package com.airbnb.mvrx;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, m28432d2 = {"Lcom/airbnb/mvrx/ViewModelDoesNotExistException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "viewModelClass", "LPr6;", "viewModelContext", "key", "(Ljava/lang/Class;LPr6;Ljava/lang/String;)V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class ViewModelDoesNotExistException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelDoesNotExistException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelDoesNotExistException(Class<?> viewModelClass, AbstractC35282Pr6 viewModelContext, String key) {
        this("ViewModel of type " + viewModelClass.getName() + " for " + viewModelContext.mo16488f() + '[' + key + "] does not exist yet!");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
