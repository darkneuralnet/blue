.class public final LJk0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJk0$a;
    }
.end annotation


# static fields
.field public static final e:LJk0;


# instance fields
.field public final a:Lq46;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsx2;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LSC1;

.field public final d:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJk0$a;

    invoke-direct {v0}, LJk0$a;-><init>()V

    invoke-virtual {v0}, LJk0$a;->b()LJk0;

    move-result-object v0

    sput-object v0, LJk0;->e:LJk0;

    return-void
.end method

.method public constructor <init>(Lq46;Ljava/util/List;LSC1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq46;",
            "Ljava/util/List<",
            "Lsx2;",
            ">;",
            "LSC1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJk0;->a:Lq46;

    iput-object p2, p0, LJk0;->b:Ljava/util/List;

    iput-object p3, p0, LJk0;->c:LSC1;

    iput-object p4, p0, LJk0;->d:Ljava/lang/String;

    return-void
.end method

.method public static e()LJk0$a;
    .locals 1

    new-instance v0, LJk0$a;

    invoke-direct {v0}, LJk0$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build LK94;
        tag = 0x4
    .end annotation

    iget-object v0, p0, LJk0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()LSC1;
    .locals 1
    .annotation build LK94;
        tag = 0x3
    .end annotation

    iget-object v0, p0, LJk0;->c:LSC1;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation build LK94;
        tag = 0x2
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsx2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LJk0;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Lq46;
    .locals 1
    .annotation build LK94;
        tag = 0x1
    .end annotation

    iget-object v0, p0, LJk0;->a:Lq46;

    return-object v0
.end method

.method public f()[B
    .locals 1

    invoke-static {p0}, LE94;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
