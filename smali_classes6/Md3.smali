.class public LMd3;
.super LNd3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMd3$a;
    }
.end annotation


# static fields
.field public static final e:LMd3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LMd3$a;

    invoke-direct {v0}, LMd3$a;-><init>()V

    invoke-virtual {v0}, LMd3$a;->f()LMd3;

    move-result-object v0

    sput-object v0, LMd3;->e:LMd3;

    return-void
.end method

.method public synthetic constructor <init>(LMd3$a;Llf7;)V
    .locals 0

    invoke-direct {p0, p1}, LNd3;-><init>(LNd3$a;)V

    return-void
.end method
