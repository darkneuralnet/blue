.class public final LHk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHk5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LGk5;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LHk5;
    .locals 1

    invoke-static {}, LHk5$a;->a()LHk5;

    move-result-object v0

    return-object v0
.end method

.method public static c()LGk5;
    .locals 1

    new-instance v0, LGk5;

    invoke-direct {v0}, LGk5;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LGk5;
    .locals 1

    invoke-static {}, LHk5;->c()LGk5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LHk5;->b()LGk5;

    move-result-object v0

    return-object v0
.end method
