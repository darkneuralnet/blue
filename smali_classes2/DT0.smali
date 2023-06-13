.class public final LDT0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCT0;


# instance fields
.field public final a:LET0;


# direct methods
.method public constructor <init>(LET0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDT0;->a:LET0;

    return-void
.end method

.method public static b(LET0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LET0;",
            ")",
            "LY94<",
            "LCT0;",
            ">;"
        }
    .end annotation

    new-instance v0, LDT0;

    invoke-direct {v0, p0}, LDT0;-><init>(LET0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LFT0;Le13;Lcom/uber/autodispose/ScopeProvider;)LBT0;
    .locals 1

    iget-object v0, p0, LDT0;->a:LET0;

    invoke-virtual {v0, p1, p2, p3}, LET0;->b(LFT0;Le13;Lcom/uber/autodispose/ScopeProvider;)LBT0;

    move-result-object p1

    return-object p1
.end method
