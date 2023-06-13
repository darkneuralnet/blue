.class public final Lx65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw65;


# instance fields
.field public final a:Ly65;


# direct methods
.method public constructor <init>(Ly65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx65;->a:Ly65;

    return-void
.end method

.method public static b(Ly65;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly65;",
            ")",
            "LY94<",
            "Lw65;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx65;

    invoke-direct {v0, p0}, Lx65;-><init>(Ly65;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)Lv65;
    .locals 1

    iget-object v0, p0, Lx65;->a:Ly65;

    invoke-virtual {v0, p1, p2, p3}, Ly65;->b(Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)Lv65;

    move-result-object p1

    return-object p1
.end method
