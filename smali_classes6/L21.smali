.class public final LL21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL21$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LAG<",
        "Lke5$a;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LL21;
    .locals 1

    invoke-static {}, LL21$a;->a()LL21;

    move-result-object v0

    return-object v0
.end method

.method public static c()LAG;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LAG<",
            "Lke5$a;",
            ">;"
        }
    .end annotation

    invoke-static {}, LI21;->c()LAG;

    move-result-object v0

    invoke-static {v0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LAG;

    return-object v0
.end method


# virtual methods
.method public b()LAG;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LAG<",
            "Lke5$a;",
            ">;"
        }
    .end annotation

    invoke-static {}, LL21;->c()LAG;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL21;->b()LAG;

    move-result-object v0

    return-object v0
.end method
