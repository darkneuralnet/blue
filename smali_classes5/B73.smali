.class public abstract LB73;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB73$a;,
        LB73$b;,
        LB73$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LB73$a;
    .locals 1

    new-instance v0, LQt$b;

    invoke-direct {v0}, LQt$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()LB73$b;
.end method

.method public abstract c()LB73$c;
.end method
