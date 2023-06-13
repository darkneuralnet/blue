.class public final LyG;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxG;


# instance fields
.field public final a:LzG;


# direct methods
.method public constructor <init>(LzG;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyG;->a:LzG;

    return-void
.end method

.method public static b(LzG;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzG;",
            ")",
            "LY94<",
            "LxG;",
            ">;"
        }
    .end annotation

    new-instance v0, LyG;

    invoke-direct {v0, p0}, LyG;-><init>(LzG;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)LwG;
    .locals 1

    iget-object v0, p0, LyG;->a:LzG;

    invoke-virtual {v0, p1, p2}, LzG;->b(Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)LwG;

    move-result-object p1

    return-object p1
.end method
