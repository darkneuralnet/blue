.class public final Lno7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldo7;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J


# direct methods
.method public constructor <init>(Ldo7;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno7;->a:Ldo7;

    iput-object p2, p0, Lno7;->b:Ljava/lang/String;

    iput-object p3, p0, Lno7;->c:Ljava/lang/String;

    iput-wide p4, p0, Lno7;->d:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lno7;->d:J

    return-wide v0
.end method

.method public final b()Ldo7;
    .locals 1

    iget-object v0, p0, Lno7;->a:Ldo7;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lno7;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lno7;->c:Ljava/lang/String;

    return-object v0
.end method
