.class public Lfw1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:F

.field public e:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfw1;->a:Ljava/lang/String;

    iput-object p2, p0, Lfw1;->b:Ljava/lang/String;

    iput-object p3, p0, Lfw1;->c:Ljava/lang/String;

    iput p4, p0, Lfw1;->d:F

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfw1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfw1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfw1;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lfw1;->e:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public e(Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, Lfw1;->e:Landroid/graphics/Typeface;

    return-void
.end method
