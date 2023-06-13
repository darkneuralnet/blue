.class public LNR5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LgP1;


# direct methods
.method public constructor <init>(LgP1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LgP1;

    iput-object p1, p0, LNR5;->a:LgP1;

    return-void
.end method
