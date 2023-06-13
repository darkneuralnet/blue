.class public LhS3$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LhS3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/CharSequence;

.field public b:Landroidx/core/graphics/drawable/IconCompat;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LhS3;
    .locals 1

    new-instance v0, LhS3;

    invoke-direct {v0, p0}, LhS3;-><init>(LhS3$b;)V

    return-object v0
.end method

.method public b(Z)LhS3$b;
    .locals 0

    iput-boolean p1, p0, LhS3$b;->e:Z

    return-object p0
.end method

.method public c(Landroidx/core/graphics/drawable/IconCompat;)LhS3$b;
    .locals 0

    iput-object p1, p0, LhS3$b;->b:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public d(Z)LhS3$b;
    .locals 0

    iput-boolean p1, p0, LhS3$b;->f:Z

    return-object p0
.end method

.method public e(Ljava/lang/String;)LhS3$b;
    .locals 0

    iput-object p1, p0, LhS3$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/CharSequence;)LhS3$b;
    .locals 0

    iput-object p1, p0, LhS3$b;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public g(Ljava/lang/String;)LhS3$b;
    .locals 0

    iput-object p1, p0, LhS3$b;->c:Ljava/lang/String;

    return-object p0
.end method
