.class public final synthetic Lco3$y;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco3;->k0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lco3$y;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco3$y;

    invoke-direct {v0}, Lco3$y;-><init>()V

    sput-object v0, Lco3$y;->b:Lco3$y;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x1

    const-class v2, Lco/bird/android/buava/Optional;

    const-string v3, "<init>"

    const-string v4, "<init>(Ljava/lang/Object;)V"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/buava/Optional;

    invoke-direct {v0, p1}, Lco/bird/android/buava/Optional;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco3$y;->a(Ljava/lang/String;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
