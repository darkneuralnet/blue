.class public final LFX$j$a$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFX$j$a$b;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
        "it",
        "",
        "a",
        "(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LFX$j$a$b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFX$j$a$b$a;

    invoke-direct {v0}, LFX$j$a$b$a;-><init>()V

    sput-object v0, LFX$j$a$b$a;->g:LFX$j$a$b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lno/nordicsemi/android/support/v18/scanner/ScanResult;->e()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {p0, p1}, LFX$j$a$b$a;->a(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
