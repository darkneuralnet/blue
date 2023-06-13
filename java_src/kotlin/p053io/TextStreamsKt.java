package kotlin.p053io;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a5\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m28432d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@JvmName(name = "TextStreamsKt")
@SourceDebugExtension({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1295#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
/* renamed from: kotlin.io.TextStreamsKt */
/* loaded from: classes8.dex */
public final class TextStreamsKt {
    @InlineOnly
    private static final BufferedReader buffered(Reader reader, int i) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static /* synthetic */ BufferedReader buffered$default(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static final long copyTo(Reader reader, Writer out, int i) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return copyTo(reader, writer, i);
    }

    public static final void forEachLine(Reader reader, Function1<? super String, Unit> action) {
        BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            for (String str : lineSequence(bufferedReader)) {
                action.invoke(str);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedReader, null);
        } finally {
        }
    }

    public static final Sequence<String> lineSequence(BufferedReader bufferedReader) {
        Sequence<String> constrainOnce;
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        constrainOnce = SequencesKt__SequencesKt.constrainOnce(new LinesSequence(bufferedReader));
        return constrainOnce;
    }

    public static final byte[] readBytes(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        InputStream it = FirebasePerfUrlConnection.openStream(url);
        try {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            byte[] readBytes = ByteStreamsKt.readBytes(it);
            CloseableKt.closeFinally(it, null);
            return readBytes;
        } finally {
        }
    }

    public static final List<String> readLines(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        forEachLine(reader, new TextStreamsKt$readLines$1(arrayList));
        return arrayList;
    }

    public static final String readText(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    public static /* synthetic */ String readText$default(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(readBytes(url), charset);
    }

    @InlineOnly
    private static final StringReader reader(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T useLines(Reader reader, Function1<? super Sequence<String>, ? extends T> block) {
        BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            T invoke = block.invoke(lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(bufferedReader, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    @InlineOnly
    private static final BufferedWriter buffered(Writer writer, int i) {
        Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static /* synthetic */ BufferedWriter buffered$default(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    @InlineOnly
    private static final String readText(URL url, Charset charset) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(readBytes(url), charset);
    }
}