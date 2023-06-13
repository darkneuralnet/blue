.class public final LDn6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCn6;


# instance fields
.field public final a:LEn6;


# direct methods
.method public constructor <init>(LEn6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDn6;->a:LEn6;

    return-void
.end method

.method public static b(LEn6;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEn6;",
            ")",
            "LY94<",
            "LCn6;",
            ">;"
        }
    .end annotation

    new-instance v0, LDn6;

    invoke-direct {v0, p0}, LDn6;-><init>(LEn6;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LFn6;)Lzn6;
    .locals 1

    iget-object v0, p0, LDn6;->a:LEn6;

    invoke-virtual {v0, p1, p2}, LEn6;->b(Lcom/uber/autodispose/ScopeProvider;LFn6;)Lzn6;

    move-result-object p1

    return-object p1
.end method
