.class public Lvi1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lvi1;

.field public static final e:Lvi1;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvi1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lvi1;-><init>(IIZ)V

    sput-object v0, Lvi1;->d:Lvi1;

    new-instance v0, Lvi1;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v1, v2}, Lvi1;-><init>(IIZ)V

    sput-object v0, Lvi1;->e:Lvi1;

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lvi1;->a:I

    iput p2, p0, Lvi1;->b:I

    iput-boolean p3, p0, Lvi1;->c:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lvi1;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lvi1;->b:I

    return v0
.end method
