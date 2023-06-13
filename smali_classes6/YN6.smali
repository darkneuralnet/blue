.class public final LYN6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LhK6;


# instance fields
.field public a:LzK6;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LzK6<",
            "LaK6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LhK6;

    const-string v1, "ReviewService"

    invoke-direct {v0, v1}, LhK6;-><init>(Ljava/lang/String;)V

    sput-object v0, LYN6;->c:LhK6;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LYN6;->b:Ljava/lang/String;

    invoke-static {p1}, LyL6;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    new-instance v0, LzK6;

    sget-object v4, LYN6;->c:LhK6;

    const-string v5, "com.google.android.finsky.inappreviewservice.InAppReviewService"

    sget-object v7, LSM6;->a:LsK6;

    move-object v2, v0

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, LzK6;-><init>(Landroid/content/Context;LhK6;Ljava/lang/String;Landroid/content/Intent;LsK6;)V

    iput-object v0, p0, LYN6;->a:LzK6;

    :cond_0
    return-void
.end method

.method public static synthetic b(LYN6;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LYN6;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c()LhK6;
    .locals 1

    sget-object v0, LYN6;->c:LhK6;

    return-object v0
.end method


# virtual methods
.method public final a()LXY5;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LXY5<",
            "Lcom/google/android/play/core/review/ReviewInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, LYN6;->c:LhK6;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, LYN6;->b:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "requestInAppReview (%s)"

    invoke-virtual {v0, v2, v1}, LhK6;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, LYN6;->a:LzK6;

    if-nez v1, :cond_0

    const-string v1, "Play Store app is either not installed or not the official version"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LhK6;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, LgN6;

    invoke-direct {v0}, LgN6;-><init>()V

    invoke-static {v0}, LCZ5;->c(Ljava/lang/Exception;)LXY5;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, LaO6;

    invoke-direct {v0}, LaO6;-><init>()V

    iget-object v1, p0, LYN6;->a:LzK6;

    new-instance v2, LuN6;

    invoke-direct {v2, p0, v0, v0}, LuN6;-><init>(LYN6;LaO6;LaO6;)V

    invoke-virtual {v1, v2}, LzK6;->a(LjK6;)V

    invoke-virtual {v0}, LaO6;->c()LXY5;

    move-result-object v0

    return-object v0
.end method
