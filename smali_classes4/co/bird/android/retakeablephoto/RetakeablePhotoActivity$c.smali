.class public abstract Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/retakeablephoto/RetakeablePhotoActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\'\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c;",
        "",
        "LGN4;",
        "impl",
        "LFN4;",
        "b",
        "LEN4;",
        "LoN4;",
        "a",
        "<init>",
        "()V",
        "retakeable-photo_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c;->a:Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(Lco/bird/android/core/mvp/BaseActivity;)Lcom/uber/autodispose/ScopeProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c;->a:Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c$a;

    invoke-virtual {v0, p0}, Lco/bird/android/retakeablephoto/RetakeablePhotoActivity$c$a;->a(Lco/bird/android/core/mvp/BaseActivity;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a(LEN4;)LoN4;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract b(LGN4;)LFN4;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
