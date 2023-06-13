.class public abstract Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase;
.super LEb5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\'\u0018\u0000 \u00082\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase;",
        "LEb5;",
        "LOq0;",
        "C",
        "LMq0;",
        "D",
        "<init>",
        "()V",
        "p",
        "a",
        "co.bird.android.lib.persistence.complaint-resolution.impl"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final p:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase;->p:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LEb5;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract C()LOq0;
.end method

.method public abstract D()LMq0;
.end method
