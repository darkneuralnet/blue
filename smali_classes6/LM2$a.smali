.class public final LLM2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLM2;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/filament/Material;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/nio/ByteBuffer;",
        "Lcom/google/android/filament/Material;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "Lcom/google/android/filament/Material;",
        "a",
        "(Ljava/nio/ByteBuffer;)Lcom/google/android/filament/Material;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final g:LLM2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LLM2$a;

    invoke-direct {v0}, LLM2$a;-><init>()V

    sput-object v0, LLM2$a;->g:LLM2$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)Lcom/google/android/filament/Material;
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, LLM2;->a:LLM2;

    invoke-virtual {v0, p1}, LLM2;->b(Ljava/nio/Buffer;)Lcom/google/android/filament/Material;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unable to load the material. Check whether the material exists"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1}, LLM2$a;->a(Ljava/nio/ByteBuffer;)Lcom/google/android/filament/Material;

    move-result-object p1

    return-object p1
.end method
