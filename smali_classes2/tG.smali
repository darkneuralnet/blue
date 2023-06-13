.class public final LtG;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsG;


# instance fields
.field public final a:LuG;


# direct methods
.method public constructor <init>(LuG;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtG;->a:LuG;

    return-void
.end method

.method public static b(LuG;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LuG;",
            ")",
            "LY94<",
            "LsG;",
            ">;"
        }
    .end annotation

    new-instance v0, LtG;

    invoke-direct {v0, p0}, LtG;-><init>(LuG;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LZa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;Lcom/uber/autodispose/ScopeProvider;)LpG;
    .locals 1

    iget-object v0, p0, LtG;->a:LuG;

    invoke-virtual {v0, p1, p2, p3}, LuG;->b(LZa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeBottomView;Lcom/uber/autodispose/ScopeProvider;)LpG;

    move-result-object p1

    return-object p1
.end method
