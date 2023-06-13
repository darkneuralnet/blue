.class public final LAv4$o$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAv4$o;->c(Ljava/io/File;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/FileUploadReceipt;",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/FileUploadReceipt;",
        "kotlin.jvm.PlatformType",
        "<anonymous parameter 0>",
        "",
        "t",
        "",
        "a",
        "(Lco/bird/android/model/FileUploadReceipt;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/io/File;

.field public final synthetic h:LAv4;


# direct methods
.method public constructor <init>(Ljava/io/File;LAv4;)V
    .locals 0

    iput-object p1, p0, LAv4$o$b;->g:Ljava/io/File;

    iput-object p2, p0, LAv4$o$b;->h:LAv4;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/FileUploadReceipt;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, LAv4$o$b;->g:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    if-eqz p2, :cond_0

    iget-object p1, p0, LAv4$o$b;->h:LAv4;

    sget-object p2, LAv4$o$b$a;->g:LAv4$o$b$a;

    invoke-virtual {p1, p2}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/FileUploadReceipt;

    check-cast p2, Ljava/lang/Throwable;

    invoke-virtual {p0, p1, p2}, LAv4$o$b;->a(Lco/bird/android/model/FileUploadReceipt;Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
