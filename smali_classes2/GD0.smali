.class public final LGD0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFD0;


# instance fields
.field public final a:LHD0;


# direct methods
.method public constructor <init>(LHD0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGD0;->a:LHD0;

    return-void
.end method

.method public static b(LHD0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHD0;",
            ")",
            "LY94<",
            "LFD0;",
            ">;"
        }
    .end annotation

    new-instance v0, LGD0;

    invoke-direct {v0, p0}, LGD0;-><init>(LHD0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LID0;Lcom/uber/autodispose/ScopeProvider;)LED0;
    .locals 1

    iget-object v0, p0, LGD0;->a:LHD0;

    invoke-virtual {v0, p1, p2}, LHD0;->b(LID0;Lcom/uber/autodispose/ScopeProvider;)LED0;

    move-result-object p1

    return-object p1
.end method
