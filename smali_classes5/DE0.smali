.class public LDE0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lbl0;

.field public final c:Lbl0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lbl0;Lbl0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDE0;->a:Landroid/content/Context;

    iput-object p2, p0, LDE0;->b:Lbl0;

    iput-object p3, p0, LDE0;->c:Lbl0;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)LCE0;
    .locals 3

    iget-object v0, p0, LDE0;->a:Landroid/content/Context;

    iget-object v1, p0, LDE0;->b:Lbl0;

    iget-object v2, p0, LDE0;->c:Lbl0;

    invoke-static {v0, v1, v2, p1}, LCE0;->a(Landroid/content/Context;Lbl0;Lbl0;Ljava/lang/String;)LCE0;

    move-result-object p1

    return-object p1
.end method
