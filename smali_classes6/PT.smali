.class public final LPT;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LWO1;


# direct methods
.method public constructor <init>(LWO1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LWO1;

    iput-object p1, p0, LPT;->a:LWO1;

    return-void
.end method


# virtual methods
.method public final a()LWO1;
    .locals 1

    iget-object v0, p0, LPT;->a:LWO1;

    return-object v0
.end method
