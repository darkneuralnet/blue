.class public final synthetic Ldz2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lez2;

.field public final synthetic c:Landroid/graphics/drawable/BitmapDrawable;


# direct methods
.method public synthetic constructor <init>(Lez2;Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldz2;->b:Lez2;

    iput-object p2, p0, Ldz2;->c:Landroid/graphics/drawable/BitmapDrawable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ldz2;->b:Lez2;

    iget-object v1, p0, Ldz2;->c:Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {v0, v1}, Lez2;->b(Lez2;Landroid/graphics/drawable/BitmapDrawable;)V

    return-void
.end method
