.class public final Ljf1;
.super Lcom/fasterxml/jackson/databind/KeyDeserializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Enum<",
        "TE;>;>",
        "Lcom/fasterxml/jackson/databind/KeyDeserializer;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000*\u000e\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B#\u0008\u0016\u0012\u0010\u0010\r\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001c\u0010\t\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Ljf1;",
        "",
        "E",
        "Lcom/fasterxml/jackson/databind/KeyDeserializer;",
        "",
        "key",
        "Lcom/fasterxml/jackson/databind/DeserializationContext;",
        "ctxt",
        "",
        "deserializeKey",
        "Ljava/lang/Class;",
        "b",
        "Ljava/lang/Class;",
        "clazz",
        "Lef1;",
        "c",
        "Lef1;",
        "cache",
        "<init>",
        "(Ljava/lang/Class;Lef1;)V",
        "jackson_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEnumMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumMapper.kt\nco/bird/android/lib/jackson/EnumKeyDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final c:Lef1;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lef1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Ljava/lang/Enum<",
            "*>;>;",
            "Lef1;",
            ")V"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/KeyDeserializer;-><init>()V

    iput-object p1, p0, Ljf1;->b:Ljava/lang/Class;

    iput-object p2, p0, Ljf1;->c:Lef1;

    invoke-virtual {p2, p1}, Lef1;->a(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public deserializeKey(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p2, p0, Ljf1;->c:Lef1;

    iget-object v0, p0, Ljf1;->b:Ljava/lang/Class;

    invoke-virtual {p2, v0, p1}, Lef1;->c(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Ljf1;->c:Lef1;

    iget-object p2, p0, Ljf1;->b:Ljava/lang/Class;

    invoke-virtual {p1, p2}, Lef1;->b(Ljava/lang/Class;)Ljava/lang/Enum;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :cond_1
    return-object p1
.end method
