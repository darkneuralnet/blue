.class public final LpB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoB0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LpB0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\"\u0010\u0007\u001a\u0010\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "LpB0;",
        "LoB0;",
        "Lio/reactivex/subjects/a;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "Lio/reactivex/subjects/a;",
        "localeSubject",
        "<init>",
        "()V",
        "b",
        "app_birdRelease"
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
        "SMAP\nConversationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationManagerImpl.kt\nco/bird/android/app/manager/ConversationManagerImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n37#2,2:82\n37#2,2:88\n1549#3:84\n1620#3,3:85\n*S KotlinDebug\n*F\n+ 1 ConversationManagerImpl.kt\nco/bird/android/app/manager/ConversationManagerImpl\n*L\n54#1:82,2\n58#1:88,2\n55#1:84\n55#1:85,3\n*E\n"
    }
.end annotation


# static fields
.field public static final b:LpB0$a;

.field public static final c:I


# instance fields
.field public final a:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LpB0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LpB0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LpB0;->b:LpB0$a;

    const/16 v0, 0x8

    sput v0, LpB0;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LpB0;->a:Lio/reactivex/subjects/a;

    return-void
.end method

.method public static final synthetic access$getLocaleSubject$p(LpB0;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, LpB0;->a:Lio/reactivex/subjects/a;

    return-object p0
.end method
