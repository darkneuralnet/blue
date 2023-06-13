.class public Lnd5$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnd5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final c:Lnd5$b;

.field public static final d:Lnd5$b;

.field public static final e:Lnd5$b;

.field public static final f:Lnd5$b;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnd5$b;

    const/4 v1, 0x1

    const-string v2, "STATE_ON"

    invoke-direct {v0, v1, v2}, Lnd5$b;-><init>(ZLjava/lang/String;)V

    sput-object v0, Lnd5$b;->c:Lnd5$b;

    new-instance v0, Lnd5$b;

    const-string v1, "STATE_OFF"

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lnd5$b;-><init>(ZLjava/lang/String;)V

    sput-object v0, Lnd5$b;->d:Lnd5$b;

    new-instance v0, Lnd5$b;

    const-string v1, "STATE_TURNING_ON"

    invoke-direct {v0, v2, v1}, Lnd5$b;-><init>(ZLjava/lang/String;)V

    sput-object v0, Lnd5$b;->e:Lnd5$b;

    new-instance v0, Lnd5$b;

    const-string v1, "STATE_TURNING_OFF"

    invoke-direct {v0, v2, v1}, Lnd5$b;-><init>(ZLjava/lang/String;)V

    sput-object v0, Lnd5$b;->f:Lnd5$b;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lnd5$b;->a:Z

    iput-object p2, p0, Lnd5$b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lnd5$b;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnd5$b;->b:Ljava/lang/String;

    return-object v0
.end method
