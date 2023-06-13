.class public final LLM2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a8\u0006\r"
    }
    d2 = {
        "LLM2;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "filamatFileLocation",
        "Lcom/google/android/filament/Material;",
        "a",
        "Ljava/nio/Buffer;",
        "filamatBuffer",
        "b",
        "<init>",
        "()V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final a:LLM2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LLM2;

    invoke-direct {v0}, LLM2;-><init>()V

    sput-object v0, LLM2;->a:LLM2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/filament/Material;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filamatFileLocation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LLM2$a;->g:LLM2$a;

    invoke-static {p1, p2, v0}, LmM4;->e(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/filament/Material;

    return-object p1
.end method

.method public final b(Ljava/nio/Buffer;)Lcom/google/android/filament/Material;
    .locals 2

    const-string v0, "filamatBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/Material$Builder;

    invoke-direct {v0}, Lcom/google/android/filament/Material$Builder;-><init>()V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/filament/Material$Builder;->payload(Ljava/nio/Buffer;I)Lcom/google/android/filament/Material$Builder;

    move-result-object p1

    const-string v0, "Builder()\n        .paylo\u2026ilamatBuffer.remaining())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LKM2;->a(Lcom/google/android/filament/Material$Builder;)Lcom/google/android/filament/Material;

    move-result-object p1

    return-object p1
.end method
