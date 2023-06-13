.class public final synthetic LxP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LwP2;

.field public final synthetic c:LwP2$b$a;

.field public final synthetic d:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(LwP2;LwP2$b$a;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;IILandroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxP2;->b:LwP2;

    iput-object p2, p0, LxP2;->c:LwP2$b$a;

    iput-object p3, p0, LxP2;->d:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    iput p4, p0, LxP2;->e:I

    iput p5, p0, LxP2;->f:I

    iput-object p6, p0, LxP2;->g:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, LxP2;->b:LwP2;

    iget-object v1, p0, LxP2;->c:LwP2$b$a;

    iget-object v2, p0, LxP2;->d:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    iget v3, p0, LxP2;->e:I

    iget v4, p0, LxP2;->f:I

    iget-object v5, p0, LxP2;->g:Landroid/widget/ImageView;

    invoke-static/range {v0 .. v5}, LwP2$b;->a(LwP2;LwP2$b$a;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;IILandroid/widget/ImageView;)V

    return-void
.end method
