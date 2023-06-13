.class public LPn1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPn1$b;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public constructor <init>(LPn1$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LPn1$b;->a(LPn1$b;)J

    move-result-wide v0

    iput-wide v0, p0, LPn1;->a:J

    invoke-static {p1}, LPn1$b;->b(LPn1$b;)J

    move-result-wide v0

    iput-wide v0, p0, LPn1;->b:J

    return-void
.end method

.method public synthetic constructor <init>(LPn1$b;LPn1$a;)V
    .locals 0

    invoke-direct {p0, p1}, LPn1;-><init>(LPn1$b;)V

    return-void
.end method
