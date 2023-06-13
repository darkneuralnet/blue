.class public abstract Ltt2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltt2$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(LLifecycleOwner;)Ltt2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LLifecycleOwner;",
            ":",
            "LXr6;",
            ">(TT;)",
            "Ltt2;"
        }
    .end annotation

    new-instance v0, Lut2;

    move-object v1, p0

    check-cast v1, LXr6;

    invoke-interface {v1}, LXr6;->getViewModelStore()LWr6;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lut2;-><init>(LLifecycleOwner;LWr6;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract c(ILandroid/os/Bundle;Ltt2$a;)Lst2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "Ltt2$a<",
            "TD;>;)",
            "Lst2<",
            "TD;>;"
        }
    .end annotation
.end method

.method public abstract d()V
.end method
