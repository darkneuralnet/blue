.class public final LdR5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LdR5$a;
    }
.end annotation


# static fields
.field public static final c:LdR5;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LdR5$a;

    invoke-direct {v0}, LdR5$a;-><init>()V

    invoke-virtual {v0}, LdR5$a;->a()LdR5;

    move-result-object v0

    sput-object v0, LdR5;->c:LdR5;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LdR5;->a:J

    iput-wide p3, p0, LdR5;->b:J

    return-void
.end method

.method public static c()LdR5$a;
    .locals 1

    new-instance v0, LdR5$a;

    invoke-direct {v0}, LdR5$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build LK94;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, LdR5;->a:J

    return-wide v0
.end method

.method public b()J
    .locals 2
    .annotation build LK94;
        tag = 0x2
    .end annotation

    iget-wide v0, p0, LdR5;->b:J

    return-wide v0
.end method
