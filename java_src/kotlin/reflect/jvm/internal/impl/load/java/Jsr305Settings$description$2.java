package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
@SourceDebugExtension({"SMAP\nJsr305Settings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings$description$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,27:1\n1#2:28\n215#3,2:29\n37#4,2:31\n*S KotlinDebug\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings$description$2\n*L\n20#1:29,2\n21#1:31,2\n*E\n"})
/* loaded from: classes8.dex */
public final class Jsr305Settings$description$2 extends Lambda implements Function0<String[]> {
    final /* synthetic */ Jsr305Settings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jsr305Settings$description$2(Jsr305Settings jsr305Settings) {
        super(0);
        this.this$0 = jsr305Settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String[] invoke() {
        List createListBuilder;
        List build;
        Jsr305Settings jsr305Settings = this.this$0;
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.add(jsr305Settings.getGlobalLevel().getDescription());
        ReportLevel migrationLevel = jsr305Settings.getMigrationLevel();
        if (migrationLevel != null) {
            createListBuilder.add("under-migration:" + migrationLevel.getDescription());
        }
        for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.getUserDefinedLevelForSpecificAnnotation().entrySet()) {
            createListBuilder.add('@' + entry.getKey() + CoreConstants.COLON_CHAR + entry.getValue().getDescription());
        }
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        return (String[]) build.toArray(new String[0]);
    }
}
